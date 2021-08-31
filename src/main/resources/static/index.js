import ReactDOM from './js/react-dom.js';
import html from "./js/htm.js";
import {Button, CircularProgress, Container} from "./js/material-ui.js";
import {BrowserRouter, Link, Route} from "./js/react-router-dom.js";
import {lazy, Suspense} from "./js/react.js";


const DashboardHRD = lazy(() => import("./Pages/DashboardHRD.js"));
const InsertCuti = lazy(() => import("./components/InsertCuti.js"));
const InsertEmployee = lazy(() => import("./components/InsertEmployee.js"));

ReactDOM.render(html`
    <${BrowserRouter}>
        <${Button} type="submit" variant="contained" component=${Link} to="/">Dasbor<//>
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
    `, document.body);