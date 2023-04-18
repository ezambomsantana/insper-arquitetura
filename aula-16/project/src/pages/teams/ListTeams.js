import React, {useState, useEffect} from 'react'
import TeamRow from './TeamRow';

export default function ListTeams() {

    const [data, setData] = useState([])

    async function listTeams() {
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
        listTeams()
    }, []);

    return (
        <div>
            <table>

                {
                    data.map((team, index) => {
                        return <TeamRow team={team} />
                    })
                }

            </table>

        </div>
    )

}