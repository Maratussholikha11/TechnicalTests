import html from "../js/htm.js";
import {
    Box, Button,
    Container,
    FormControl, IconButton, InputAdornment,
    InputLabel,
    OutlinedInput,
    Paper,
    Stack,
    TextField,
    Typography
} from "../js/material-ui.js";
import {useState} from "../js/react.js";
import MaterialIcon from "../components/MaterialIcon.js";

function Login (){

    const [values, setValues] = useState({
        amount: '',
        password: '',
        weight: '',
        weightRange: '',
        showPassword: false,
    });

    const handleChange = (prop) => (event) => {
        setValues({ ...values, [prop]: event.target.value });
    };

    const handleClickShowPassword = () => {
        setValues({
            ...values,
            showPassword: !values.showPassword,
        });
    };

    const handleMouseDownPassword = (event) => {
        event.preventDefault();
    };

    return html`
          <${Stack} padding=${2} spacing=${2}>
            <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                Login
            <//>
          <//>
        <${Container} maxWidth="sm" >
            <${Box} maxWidth="sm" sx=${{
                bgcolor: '#cfe8fc',
                height: '100vh',
                display: 'flex',
                flexWrap: 'wrap',
                alignItems:'center',
                alignContent: 'center',
                justifyContent: 'center',
                }}>
                <${Paper} elevation=${3} maxwidth="xl">
                    <form>
                        <${Stack} spacing=${2}>
                            <${TextField} id="standard-basic" label="Username" variant="standard" name="username" onChange=${handleChange}/>
                                <${FormControl} sx=${{ m: 1, width: '25ch' }} variant="outlined">
                                <${InputLabel} htmlFor="outlined-adornment-password">Password<//>
                                <${OutlinedInput}
                                        id="outlined-adornment-password"
                                        type=${values.showPassword ? 'text' : 'password'}
                                value=${values.password}
                                onChange=${handleChange('password')}
                                endAdornment=${html`
                                    <${InputAdornment} position="end">
                                        <${IconButton}
                                                aria-label="toggle password visibility"
                                                onClick=${handleClickShowPassword}
                                                onMouseDown=${handleMouseDownPassword}
                                                edge="end"
                                        >
                                            ${values.showPassword ? html`<${MaterialIcon}>visibility_off<//>` : html`<${MaterialIcon}>visibility<//>`}
                                    <//>
                                <//>
                                `
                                }
                                label="Password"
                                />
                                <//>
                            <${Stack} direction="row" spacing=${2} justifyContent="flex-end">
                                <${Button} type="submit" variant="contained">Masuk<//>
                            <//>
                        <//>
                    </form>
                <//>
            <//>
        <//>
    `;
}
export default Login;