import axios from 'axios';

var  Url="http://localhost:8081";
export function  userLogin (data){    
    console.log(data);
    console.log("data");
    return axios.post(Url+"/user/login", data) ;
}