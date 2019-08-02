import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import {BrowserRouter as Router, Route,Link} from 'react-router-dom';
import Main from './components/Main';
import About from './About';
import UserDetails from './components/UserDetails';
const router = (
    <Router>
        <ul>
            <li><Link to="/" >Home</Link></li>
            <li><Link to="/main" >Main</Link></li>
            <li><Link to="/about" >About</Link></li>
            {/* <li><Link to="/users" >UserDetails</Link></li> */}
        </ul>
        <div>
            <Route exact path="/" component={App}/> 
            <Route path="/main" component={Main}/>
            <Route path="/about" component={About}/>
            <Route path="/users/:id" component={UserDetails}/>
      </div>
    </Router>
)


ReactDOM.render(
    router, 
    document.getElementById('root'));