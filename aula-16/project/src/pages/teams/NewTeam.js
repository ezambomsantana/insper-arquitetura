import React, {useState, useEffect} from 'react'

export default function NewTeam() {

    const [identifier, setIdentifier] = useState()
    const [name, setName] = useState()
    const [stadium, setStadium] = useState()
    const [data, setData] = useState([])

    const handleSubmit = e => {
        e.preventDefault()
        
        var data = {
            'identifier': identifier,
            'name': name,
            'stadium': stadium
        }

        fetch('http://localhost:8080/team', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        }).then(response => {
            console.log(response.status)
            if (response.status === 200) {
                sendActivation()
                alert('Team saved')
            }
        }).catch(e => {
            alert("Error creating team.");

        })
    }


    async function sendActivation() {
        let data = await fetch('http://localhost:8080/team', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            console.log(response.status)
            if (response.status === 200) {
                return response.json();
            } else {
                return null;
            }
        })
        console.log(data)
        setData(data)
    };

    useEffect(() => {
        sendActivation()
    }, []);


    

    return (


        <div>

            <form onSubmit={handleSubmit}>

                Identifier: <input id='identifier' name='identifier' onChange={e => setIdentifier(e.target.value)}></input> <br></br>       
                Name: <input id='name' name='name' onChange={e => setName(e.target.value)}></input>        <br></br>
                Stadium: <input id='stadium' name='stadium' onChange={e => setStadium(e.target.value)}></input>       <br></br> 
                <input type='submit' value='Cadastrar'></input>
            </form>

            <table>

                {
                    data.map((user, index) => {
                        return <tr>
                            <td>{user.identifier}</td>
                            <td>{user.name}</td>
                        </tr> 
                    })
                }

            </table>

        </div>
    )

}