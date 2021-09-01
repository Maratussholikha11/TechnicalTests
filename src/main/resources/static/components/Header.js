import html from "../js/htm.js";
import {AppBar, Box, Button, Divider, IconButton, Menu, MenuItem, Toolbar, Typography} from "../js/material-ui.js";
import MaterialIcon from "./MaterialIcon.js";
import {useState} from "../js/react.js";

function Header(props) {

    const [anchorEl, setAnchorEl] = useState(null);

    const handleMenu = (event) => {
        setAnchorEl(event.currentTarget);
    };

    const handleClose = () => {
        setAnchorEl(null);
    };

    return html`
            <${AppBar} position="static">
                <${Toolbar}>
                    <${IconButton}
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="menu"
                        sx=${{ mr: 2 }}
                        onClick=${props.toggleDrawer}
                    >
                        <${MaterialIcon}>menu<//>
                    <//>
                    <${Typography} variant="h6" component="div" sx=${{ flexGrow: 1 }}>
                        Sistem Cuti
                    <//>
                    
                    <div>
                        <${IconButton}
                                size="large"
                                aria-label="account of current user"
                                aria-controls="menu-appbar"
                                aria-haspopup="true"
                                onClick=${handleMenu}
                                color="inherit"
                        >
                            <${MaterialIcon}>account_circle<//>
                        <//>
                        <${Menu}
                                    id="menu-appbar"
                                    anchorEl=${anchorEl}
                                    anchorOrigin=${{
                                    vertical: 'top',
                            horizontal: 'right',
                            }}
                            keepMounted
                            transformOrigin=${{
                            vertical: 'top',
                            horizontal: 'right',
                            }}
                            open=${Boolean(anchorEl)}
                            onClose=${handleClose}
                            >
                            <${MenuItem} onClick=${handleClose}><${MaterialIcon}>person<//> Profil Saya<//>
                            <${MenuItem} onClick=${handleClose}><${MaterialIcon}>password<//> Ganti Password<//>
                            <${Divider}/>
                            <${MenuItem} onClick=${handleClose}><${MaterialIcon}>logout<//> Keluar<//>
                        <//>
                    </div>
                    
                <//>
            <//>
    `;
}

export default Header;