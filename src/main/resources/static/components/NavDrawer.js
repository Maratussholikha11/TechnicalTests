import {Box, Divider, Drawer, List, ListItem, ListItemIcon, ListItemText} from "../js/material-ui.js";
import html from "../js/htm.js";
import MaterialIcon from "./MaterialIcon.js";

function NavDrawer(props){
    return html`
        <${Drawer}
            open=${props.open}
            onClose=${props.onClose}
        >
            <${Box}
                sx=${{ width: 250 }}
                role="presentation"
                onClick=${props.onClose}
                onKeyDown=${props.onClose}
            >
                <${List}>
                    <${ListItem} button>
                        <${ListItemIcon}>
                            <${MaterialIcon}>dashboard<//>
                        <//>
                        <${ListItemText} primary="DashBoard" />
                    <//>
                    <${ListItem} button>
                        <${ListItemIcon}>
                            <${MaterialIcon}>checklist_rtl<//>
                        <//>
                        <${ListItemText} primary="Monitoring" />
                    <//>
                <//>
                <${Divider} />
                <${List}>
                    <${ListItem} button>
                        <${ListItemIcon}>
                            <${MaterialIcon}>dashboard<//>
                        <//>
                        <${ListItemText} primary="DashBoard" />
                    <//>
                    <${ListItem} button>
                        <${ListItemIcon}>
                            <${MaterialIcon}>checklist_rtl<//>
                        <//>
                        <${ListItemText} primary="Monitoring" />
                    <//>
                <//>
            <//>
        <//>
    `;
}
export default NavDrawer;