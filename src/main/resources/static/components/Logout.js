import html from "../js/htm.js";
import {Button, Dialog, DialogActions, DialogContent, DialogContentText, DialogTitle} from "../js/material-ui.js";

function Logout(props){

    const [open, setOpen] = React.useState(false);

    const handleClickOpen = () => {
        setOpen(true);
    };

    const handleClose = () => {
        setOpen(false);
    };

    return html`
        <${Dialog }
                open=${props.open}
                onClose=${props.onClose}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description"
        >
            <${DialogTitle} id="alert-dialog-title">
                ${"Keluar"}
            <//>
            <${DialogContent}>
                <${DialogContentText} id="alert-dialog-description">
                    Apakah anda yakin keluar dari akun ini?
                <//>
            <//>
            <${DialogActions}>
                <${Button} onClick={handleClose}>Ya<//>
                <${Button} onClick={handleClose} autoFocus>
                    Tidak
                <//>
            <//>
        <//>
    `;
}
export  default  Logout;