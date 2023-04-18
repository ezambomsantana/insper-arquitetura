import React, {useState, useEffect} from 'react'

export default function TeamRow({team}) {

    return (
         <tr>
            <td>{team.identifier}</td>
            <td>{team.name}</td>
         </tr> 

    )

}