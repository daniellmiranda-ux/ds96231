import { useState } from 'react'
import './style.css'

export default function InfoCurso() {
    const [nome,Setnome] = useState ("Logica de Programação")
    const [cargaHorarria,SetcargaHoraria] = useState (162)
    const [dataInicio,SetdataInicio] = useState ("03/02/2025")
    const [dataTermino,SetdataTermino] = useState ("23/07/2025")
    const [iniciosalario,Setiniciosalario] = useState (1066)
    const [salariotermino,Setsalariotermino] = useState (2000)

    return(
        <div className='info-curso'>
            <h2>Dados do curso:</h2>
            <p>Nome:{ nome }</p>
            <p>Data de inicio: {dataInicio}</p>
            <p>Data  de termino: {dataTermino}</p>
            <p>Salário inicial: {iniciosalario}
            </p>Salario termino: {salariotermino}
        
        </div>
    )
}