import { Box, Button, Grid, Snackbar, TextField } from '@mui/material'
import React, { useEffect, useState } from 'react'
import ListTeams from './ListTeams'


export default function NewTeam() {

    const [identifier, setIdentifier] = useState()
    const [name, setName] = useState()
    const [mensagem, setMensagem] = useState()
    const [open, setOpen] = useState()

    const handleClose = (event, reason) => {
        setOpen(false);
    };

    const handleClick = e => {

        const data = {
            'identifier': identifier,
            'name': name
        }

        fetch('http://localhost:8080/team', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        }).then(response => {
            if (response.status === 200) {
                //listTeams()
                setMensagem('Time cadastrado com sucesso')
                setOpen(true)
            }
        }).catch(ex => {
            setMensagem('Erro ao cadastrar time')
            setOpen(true)
        })

    }


    return (
            <Box
                sx={{
                    width: 600,
                    mx: 'auto',
                    marginTop: '200px',
                    width: '40%'
                }}
            >

                <Grid container spacing={2}>
                    <Grid item xs={12}>
                        <TextField fullWidth id="standard-basic" label="Identifier" variant="standard" onChange={e => setIdentifier(e.target.value)} />
                    </Grid>
                    <Grid item xs={12}>
                        <TextField fullWidth id="standard-basic" label="Name" variant="standard" onChange={e => setName(e.target.value)} />
                    </Grid>
                    <Grid item xs={12}>
                        <Button variant="contained" onClick={handleClick}>Enviar</Button>
                    </Grid>
                </Grid>


                <Snackbar
                    open={open}
                    autoHideDuration={6000}
                    onClose={handleClose}
                    message={mensagem}
                />

            </Box>
    )

}