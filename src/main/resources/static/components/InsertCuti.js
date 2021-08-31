import html from "../js/htm.js";
import {Button,FormControl,MenuItem,TextField, InputLabel, Paper, Select,Stack} from "../js/material-ui.js";
import {useState} from "../js/react.js";

function InsertCuti(props){
    const [karyawan, setKaryawan] = useState({});

    const handleChange = (event) => setKaryawan({...karyawan, [event.target.name]: event.target.value});

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(karyawan);
        fetch('/pengajuancuti', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(karyawan)
        })
            .then(response => {
                console.log(response)
                return response.json();
            })
            .then(json => console.log(json))
    };

    return html`
        <${Paper} elevation=${3} sx=${{p: 4}}>
            <h1>Tambah Pengajuan Cuti</h1>
            <form n onSubmit=${handleSubmit}>
                <${Stack} spacing=${2}>
                    <${TextField} id="standard-basic" label="Employee Id" variant="standard" name="employeeId" onChange=${handleChange}/>
                    <${FormControl} fullWidth>
                        <${InputLabel} id="status-cuti" >Jenis Cuti<//>
                        <${Select}
                                labelId="status-cuti"
                                id="status-select"
                                value=${karyawan.statusCuti}
                                label="karyawan"
                                name="statusCutiId"
                                onChange=${handleChange}
                        >
                            <${MenuItem} value=${1}>Tahunan<//>
                            <${MenuItem} value=${2}>Lintas Tahun<//>
                           
                        <//>
                    <//>
                    <${TextField} id="standard-basic" label="Id Karyawan Pengganti" variant="standard" name="penggantiId" onChange=${handleChange}/>            
                    <${TextField} id="standard-basic" label="Id HRD" variant="standard" name="hrdId" onChange=${handleChange}/>
                    <${TextField} id="standard-basic" label="Alamat" variant="standard" name="alamat" onChange=${handleChange}/>
                    <${TextField} id="standard-basic" label="No Telphone" variant="standard" name="noTelp" onChange=${handleChange}/>
                    <${TextField} id="standard-basic" label="Keterangan" variant="standard" name="keterangan" onChange=${handleChange}/>
                    <${TextField} id="standard-basic" label="Lama Cuti" variant="standard" name="lamaCuti" onChange=${handleChange}/>
                    <${Stack} direction="row" spacing=${2} justifyContent="flex-end">
                        <${Button} type="reset" variant="outlined">Kembali<//>
                        <${Button} type="submit" variant="contained">Simpan<//>
                    <//>
                <//>
            </form>
        <//>
    `;
}
export default InsertCuti;