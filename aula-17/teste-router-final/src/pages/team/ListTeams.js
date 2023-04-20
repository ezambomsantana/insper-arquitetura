import React, { useEffect, useState } from 'react'

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


    return (
        <table>

            {
                data.map((team, index) => {
                    return <tr>
                            <td>{team.identifier}</td>
                            <td>{team.name}</td>
                        </tr>
                })
            }

        </table>
    )

}