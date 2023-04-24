import './App.css';
import NewTeam from './pages/team/NewTeam';
import { Link, Route, Routes } from 'react-router-dom';
import ListTeams from './pages/team/ListTeams';
import { AppBar, Button, IconButton, Toolbar, Typography } from '@mui/material';

function App() {
  return (
    <div className="App">

      <AppBar position="static">
        <Toolbar>
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            Times
          </Typography>
          <Link to='/new' ><Button color="inherit">New Team</Button></Link>
          <Link to='/list'><Button color="inherit">List Teams</Button></Link>
        </Toolbar>
      </AppBar>

        
        <Routes>
          <Route path='/new' element={<NewTeam/>}></Route>
          <Route path='/list' element={<ListTeams/>}></Route>
        </Routes>



    </div>
  );
}

export default App;
