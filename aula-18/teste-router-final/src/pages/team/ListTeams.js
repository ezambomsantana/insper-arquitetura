import React, { useEffect, useState } from 'react'
import { DataGrid } from '@mui/x-data-grid';
import { Box } from '@mui/material';

export default function ListTeams() {

    const [data, setData] = useState([])


    async function listTeams() {
        let listTeams = await fetch('http://localhost:8080/team', {
            method: 'GET'
        }).then(response => {
            if (response.status === 200) {
                return response.json()
            }
            return []
        }).catch(ex => {
            //setMensagem('Erro ao listar times')
            return []
        })
        setData(listTeams)
    }

    useEffect(() => {
        listTeams()
    }, [])


    const columns = [
        { field: 'identifier', headerName: 'ID', width: '300' },
        { field: 'name', headerName: 'Name', width: '700' }
    ]


    return (
        <Box
            sx={{
                width: 600,
                mx: 'auto',
                marginTop: '200px',
                width: '40%'
            }}
        >
            <DataGrid
                autoHeight
                rows={data}
                columns={columns}
                getRowId={(row) => row.identifier}
                initialState={{
                    pagination: {
                        paginationModel: {
                            pageSize: 10,
                        },
                    },
                }}
                pageSizeOptions={[5, 10, 15]}
                checkboxSelection
                disableRowSelectionOnClick
            />

        </Box>
    )

}