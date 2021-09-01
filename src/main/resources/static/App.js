import html from "./js/htm.js";
import {Button, CircularProgress, Container} from "./js/material-ui.js";
import {BrowserRouter, Link, Route} from "./js/react-router-dom.js";
import {lazy, Suspense, useState} from "./js/react.js";
import Header from "./components/Header.js";
import NavDrawer from "./components/NavDrawer.js";

const DashboardHRD = lazy(() => import("./Pages/DashboardHRD.js"));
const InsertCuti = lazy(() => import("./components/InsertCuti.js"));
const InsertEmployee = lazy(() => import("./components/InsertEmployee.js"));

function App() {

    const [drawerOpen, setDrawerOpen] = useState(false);

    return html`
    <${BrowserRouter}>
        <${Header} toggleDrawer=${() => setDrawerOpen(true)}/>
        <${NavDrawer} open=${drawerOpen} onClose=${() => setDrawerOpen(false)}/>
        <${Button} type="submit" variant="contained" component=${Link} to="/">Dasbor222<//>
        <${Button} type="submit" variant="contained" component=${Link} to="/insertcuti">Insert Cuti<//>
        <${Button} type="submit" variant="contained" component=${Link} to="/insert">Insert<//>
        <${Container} maxWidth="md">
            <${Suspense} fallback=${html`<${CircularProgress}/>`}>
                <${Route} exact path="/">
                    <${DashboardHRD}/>
                <//>
                <${Route} exact path="/insertcuti">
                    <${InsertCuti}/>
                <//>
                <${Route} exact path="/insert">
                    <${InsertEmployee}/>
                <//>
            <//>
        <//>
    <//>
    `;
}

export default App;