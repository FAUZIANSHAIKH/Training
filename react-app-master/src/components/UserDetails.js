import React from 'react';
import Axios from 'axios';

   
export default class UserDetails extends React.Component{
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
        const {id} =this.props.match.params;
        const arr=Axios.get('https://jsonplaceholder.typicode.com/users/'+id)
        .then(res => this.setState({
            
            
                users:res.data
            
        })
        );
        console.log(arr)
   }
    render(){
        const {id} =this.props.match.params;
        console.log(`id is ${id}`)
        return(
            
        
            <div className="user" style={{width: 18 +'rem'}}>
                <div className="user-body">
                    <h5 className="user-title">{ this.state.users.name}</h5>
                    <h5 className="user-title">{ this.state.users.email}</h5>
                    <h5 className="user-title">{ this.state.users.id}</h5>
                    <p className="user-text">{this.props.body}</p>
                   
                </div>
         </div>
        );
          
        
    }
}
