import {Paper, Stack, Typography} from "../js/material-ui.js";
import MaterialIcon from "../components/MaterialIcon.js";
import html from "../js/htm.js";

function DashboardKaryawan(){
    return html`
    <${Stack} padding=${2} spacing=${2}>
            <${Typography} variant="h4" sx=${{color:"#00c853"}}>
                Dashboard
            <//>
            <${Stack} direction="row" padding=${8} spacing=${2} justifyContent="space-evenly">
                <${Paper } elevation=${3} sx=${{p: 4,background :"#90cc00",color:"white",fontsize:35}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>badge<//>
                        <${Typography} variant="h2">
                            10
                        <//> 
                    <//>
                    <${Typography} variant="h4" sx=${{color:"white"}}>
                        Cuti Digunakan
                    <//>
                <//>
                <${Paper } elevation=${3} sx=${{p: 4,background :"#c7b800",color:"white",fontsize:11}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>groups<//>
                        <${Typography} variant="h2" >
                            5
                        <//>
                    <//>
                    <${Typography} variant="h4" sx=${{color:"white"}}>
                        Sisa Cuti Tahunan
                    <//>
                <//>
                <${Paper } elevation=${3} sx=${{p: 4,background :"#c30000" ,color:"white",fontsize:11}}>
                    <${Stack} direction="row" padding=${2} spacing=${2} justifyContent="space-evenly">
                        <${MaterialIcon} size=${64}>notifications<//>
                        <${Typography} variant="h2">
                            4
                        <//>
                    <//>
                    <${Typography} variant="h4" sx=${{color:"white"}}>
                        Sisa Cuti Lintas Tahun
                    <//>
                <//>
            <//>
        <//>
    `;
}
export  default DashboardKaryawan;