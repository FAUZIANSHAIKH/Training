import React,{Component} from 'react';
import UserDetails from './UserDetails';
import {BrowserRouter as Router, Route,Link} from 'react-router-dom';
export default class User extends Component {
    constructor(){
        super();
        //this.details = this.details.bind(this);
    }
   /* details(){
        console.log('Printing the value of this .. inside the details');
        console.log(this);
    }*/
    render(){
        return  (
            <div className="user" style={{width: 18 +'rem'}}>
                <div className="user-body">
                    <h5 className="user-title">{ this.props.title.toUpperCase()}</h5>
                    <p className="user-text">{this.props.body}</p>
                    <Link to={`users/${this.props.id}`} >Details</Link>
                </div>
                </div>
        );
    }
}