import React from 'react';
import User from './User';
import Axios from 'axios';

export default class Main extends React.Component {
    constructor(){
        super();
        this.state={
            users:[]
        }
        this.selectedProduct = this.selectedProduct.bind(this);
    }

    selectedProduct({title,body}){
       // const filteredList = this.state.phones.filter(phone => phone.name === title);
        console.log(`${title} ${body}`);
        /*this.setState({
            phones:filteredList
        })*/
    }

    componentDidMount(){
        console.log(`Component is mounted on the DOM`)
        const arr=Axios.get('https://jsonplaceholder.typicode.com/users')
        .then(res => this.setState({
            
            
                users:res.data
            
        })
        );
        console.log(arr)
   }

    render(){
        return (
            <div className="container">
                <div className="row">
                {
                    this.state.users.map((user,index) => <User 
                                                key={index} 
                                                title={user.name} 
                                                body={user.email}
                                                id={user.id}
                                                selected = {this.selectedProduct}/>)
                }
                </div>
            </div>
        );
    }
}