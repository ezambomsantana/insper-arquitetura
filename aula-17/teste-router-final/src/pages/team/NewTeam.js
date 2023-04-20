import React, { useEffect, useState } from 'react'
import ListTeams from './ListTeams'


export default function NewTeam() {

    const [identifier, setIdentifier] = useState()
    const [name, setName] = useState()
    const [mensagem, setMensagem] = useState()
    
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
            }
        }).catch(ex => {
            setMensagem('Erro ao cadastrar time')
        })

    }


    return (
        <div>
            Identifier: <input  id='identifier' type='text' 
                onChange={e => setIdentifier(e.target.value)} /> <br></br>
            Name:  <input id='name' type='text' 
                onChange={e => setName(e.target.value)}/>
            <br></br>
            <input type='button' onClick={handleClick} value='Enviar'></input>

            <div>{mensagem}</div>

        </div>
    )

}