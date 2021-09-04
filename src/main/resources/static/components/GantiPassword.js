import html from "../js/htm.js";
import {useState} from "../js/react.js";
import {Button, Dialog, DialogActions, DialogContent, DialogTitle, Stack, TextField} from "../js/material-ui.js";

function GantiPassword (props){

    const [open, setOpen] = React.useState(false);

    const handleClickOpen = () => {
        setOpen(true);
    };

    const handleClose = () => {
        setOpen(false);
    };
    return html`
        <${Dialog} open=${props.open} onClose=${props.onClose} scroll="paper" component="form" fullWidth>
            <${DialogTitle}>Ganti Password<//>
            <${DialogContent} dividers>
                <${Stack} spacing=${2}>
                    <${TextField}
                            id="filled-password-input"
                            label="Password Baru"
                            type="password"
                            autoComplete="current-password"
                            variant="filled"
                            name="passnew"
                    />
                    <${TextField}
                            id="filled-password-input"
                            label="Verifikasi Password Baru"
                            type="password"
                            autoComplete="current-password"
                            variant="filled"
                            name="passnew"
                    />
                <//>
            <//>
            <${DialogActions}>
                <${Button} type="reset" variant="outlined">Kembali<//>
                <${Button} type="submit" variant="contained">Simpan<//>
            <//>
        <//>
    
    `;
}export default GantiPassword;