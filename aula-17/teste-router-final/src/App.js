import './App.css';
import NewTeam from './pages/team/NewTeam';
import { Link, Route, Routes } from 'react-router-dom';
import ListTeams from './pages/team/ListTeams';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <Link to='/new'>New Team</Link>
        <Link to='/list'>List Teams</Link>
      
        <Routes>
          <Route path='/new' element={<NewTeam/>}></Route>
          <Route path='/list' element={<ListTeams/>}></Route>
        </Routes>


      </header>

    </div>
  );
}

export default App;
