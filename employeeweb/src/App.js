
import { Routes,Route } from 'react-router-dom';
import './App.css';
import Header from './pages/header/Header';
import Dashboard from './pages/dashboard/Dashboard';
import Nomatch from './pages/noMatch/Nomatch';
import PostUser from './pages/employee/PostUser';




function App() {
  return (
    <>
       <Header/>git
       <Routes>
         <Route path= "/" element={<Dashboard/>}/>
         <Route path= "/employee" element={<PostUser/>}/>
         <Route path= "*" element={<Nomatch/>}/>
       </Routes>
    </>
  );
}

export default App;
