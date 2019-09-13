import React, { Component } from 'react'
import { TextField, Card, Button } from '@material-ui/core'
import { withRouter } from 'react-router-dom'
import '../App.css'
import Snackbar from '@material-ui/core/Snackbar';
import { userLogin } from '../service/UserServices';

class LoginUser extends Component {
    constructor(props) {
        super(props);

        this.state = {
            emailId: "",
            password: "",
            snackBarMessage: "",
            openSnackBar: false,
        }

    }
    //event handling for Username
    handlingUserNamechanges = e => {
        const emailId = e.target.value;
        this.setState({ emailId: emailId });
        console.log(emailId);
    }

    //event handlingh for Password
    handlingPasswordChanges = e => {
        const password = e.target.value;
        this.setState({ password: password });
        console.log(password);
    }


    handleSubmit1 = (event) => {


        //For User Email
        if (!/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/.test(this.state.emailId)) {
            this.setState({
                openSnackBar: true,
                snackBarMessage: "valid Email is Required.....!"
            })
        }
        else if (!this.state.emailId) {
            this.setState = {
                openSnackBar: true,
                snackBarMessage: "EmailId require....!"
            }
        }
        //For User Password
        else if (this.state.password === "") {
            this.setState({
                openSnackBar: true,
                snackBarMessage: "Password is Required.....!"
            })
        }
        else {
            var data = {
                emailId: this.state.emailId,
                password: this.state.password
            };
            console.log(data);
            userLogin(data).then(response => {
                console.log(response);
                console.log("Login Successfully")

                this.setState({
                    openSnackBar: true,
                    snackBarMessage: "Login Successfully!!"
                })
            })
                .catch((error) => {
                    console.log(error);
                    console.log("Login error");

                });
        };
    }

    handleSnackClose = () => {
        this.setState({
            openSnackBar: false
        })
    }


    render() {
        return (
            <div className="root">
                <div className="container1">

                    <Card className="card" >


                        <div>
                            <h1 >
                                <span className="i">I</span>
                                <span className="f">f</span>
                                <span className="l">l</span>
                                <span className="i">i</span>
                                <span className="x">x</span>
                            </h1>
                        </div>

                        <div><b><h2>Use Your Iflix Account</h2></b></div>

                        <div>
                            <TextField
                                id="outlined-password-input"
                                label="emailId"
                                type="emailId"
                                value={this.state.emailId}
                                onChange={this.handlingUserNamechanges}
                                margin="normal"
                                variant="outlined"
                            />
                        </div>

                        <br />

                        <div>
                            <TextField
                                id="outlined-password-input"
                                label="password"
                                type="password"
                                value={this.state.password}
                                onChange={this.handlingPasswordChanges}
                                margin="normal"
                                variant="outlined"
                            />
                        </div>

                        <br />

                        <div> <Button onClick={this.handleSubmit1} > <font color="blue" > User-Login</font></Button></div>


                    </Card>

                </div>
                <Snackbar
                    anchorOrigin={{
                        vertical: 'top',
                        horizontal: 'right',
                    }}
                    open={this.state.openSnackBar}
                    autoHideDuration={4000}
                    onClose={this.handleSnackClose}
                    variant="error"
                    ContentProps={{
                        'aria-describedby': 'message-id',
                    }}
                    message={<span id="message-id"> {this.state.snackBarMessage} </span>}
                    action={[
                        <div key="undo">
                            <Button key="undo" color="primary" size="small" onClick={this.handleSnackClose}>
                                OK
                  </Button>
                        </div>
                    ]}
                />

            </div>
        )
    }
}
export default withRouter(LoginUser);