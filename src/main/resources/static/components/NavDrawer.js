import {Box, Divider, Drawer, List, ListItem, ListItemButton, ListItemIcon, ListItemText} from "../js/material-ui.js";
import html from "../js/htm.js";
import MaterialIcon from "./MaterialIcon.js";
import {Link} from "../js/react-router-dom.js";

function NavDrawer(props){
    return html`
        <${Drawer}
            open=${props.open}
            onClose=${props.onClose}
        >
            <${Box}
                sx=${{ width: 250 ,color :"#4c8c4a" }}
                role="presentation"
                onClick=${props.onClose}
                onKeyDown=${props.onClose}
            >
                <${List}>
                    <${ListItemButton} component=${Link} to="/">
                        <${ListItemIcon}>
                            <${MaterialIcon}>dashboard<//>
                        <//>
                        <${ListItemText} primary="DashBoard" />
                    <//>
                    <${Divider}/>
                    <${ListItemButton} component=${Link} to="/monitoring">
                        <${ListItemIcon}>
                            <${MaterialIcon}>checklist_rtl<//>
                        <//>
                        <${ListItemText} primary="Monitoring" />
                    <//>
                      <${ListItemButton} component=${Link} to="/infocutikaryawan">
                        <${ListItemIcon}>
                            <${MaterialIcon}>info<//>
                        <//>
                        <${ListItemText} primary="Info Cuti Karyawan" />
                    <//>
                    <${ListItem} component=${Link} to="/laporancuti">
                        <${ListItemIcon}>
                            <${MaterialIcon}>summarize<//>
                        <//>
                        <${ListItemText} primary="Laporan Cuti" />
                    <//>
                     <${ListItem} component=${Link} to="/tambahdatakaryawan">
                        <${ListItemIcon}>
                            <${MaterialIcon}>person_add_alt<//>
                        <//>
                        <${ListItemText} primary="Tambah Data Karyawan" />
                    <//>
                    
                    <${Divider}/>
                    <${ListItem} component=${Link} to="/dashboardkaryawan">
                        <${ListItemIcon}>
                            <${MaterialIcon}>dashboard<//>
                        <//>
                        <${ListItemText} primary="Dashboard" />
                    <//>
                    <${Divider}/>
                    <${ListItemButton} component=${Link} to="/monitoringkaryawan">
                        <${ListItemIcon}>
                            <${MaterialIcon}>checklist_rtl<//>
                        <//>
                        <${ListItemText} primary="Monitoring" />
                    <//>
                    
                     <${Divider}/>
                    <${ListItemButton} component=${Link} to="/login">
                        <${ListItemIcon}>
                            <${MaterialIcon}>login<//>
                        <//>
                        <${ListItemText} primary="Login" />
                    <//>
                    
                <//>
            <//>
        <//>
    `;
}
export default NavDrawer;