import html from "../js/htm.js";
import {Stack, Typography} from "../js/material-ui.js";

function LaporanCuti(){

    return html`
     <${Stack} padding=${2} spacing=${2}>
            <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                Laporan Cuti
            <//>
     <//>
    `;
}
export default LaporanCuti;