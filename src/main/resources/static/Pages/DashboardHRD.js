import html from "../js/htm.js";
import {Paper, Stack, Typography} from "../js/material-ui.js";
import MaterialIcon from "../components/MaterialIcon.js";

function DashboardHRD() {
    return html`
        <${Stack} padding=${2} spacing=${2}>
            <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                Dashboard
            <//>
            <${Stack} direction="row" padding=${8} spacing=${2} justifyContent="space-evenly">
                <${Paper } elevation=${3} sx=${{p: 4,color:"#90cc00",fontsize:35}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>badge<//>
                        <${Typography} variant="h2">
                            10
                        <//> 
                    <//>
                    <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                        Jumlah Karyawan
                    <//>
                <//>
                <${Paper } elevation=${3} sx=${{p: 4,color:"#c7b800",fontsize:11}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>groups<//>
                        <${Typography} variant="h2" >
                            5
                        <//>
                    <//>
                    <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                        Cuti Disetujui
                    <//>
                <//>
                <${Paper } elevation=${3} sx=${{p: 4,color:"#c30000",fontsize:11}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>notifications<//>
                        <${Typography} variant="h2">
                            4
                        <//>
                    <//>
                    <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                        Menunggu Tindakan
                    <//>
                <//>
            <//>
        <//>
    `;
}

export default DashboardHRD;