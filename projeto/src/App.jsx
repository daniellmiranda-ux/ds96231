import { useState } from 'react'
import './App.css'
import Mensagem from './components/Mensagem'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <h1>Meu Projeto</h1>
     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque molestias, nesciunt praesentium earum sapiente illum incidunt quibusdam officia quia, minima ratione perferendis accusamus, mollitia amet possimus quo repellat nulla alias?z</p>
     <Mensagem />

    </>
  )
}

export default App
