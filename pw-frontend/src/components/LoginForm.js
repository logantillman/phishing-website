import React, { useState } from 'react';

function LoginForm({ Login }) {
    const [credentials, setCredentials] = useState({username: "", password: ""})

    const submitHandler = e => {
        e.preventDefault();

        Login(credentials);
    }

    return (
        <form onSubmit={submitHandler}>
            <div className="form-inner">
                <h2>Login</h2>
                <div className="form-group">
                    <label htmlFor="username">Username / Email:</label>
                    <input type="text" name="username" id="username" onChange={e => setCredentials({...credentials, username: e.target.value})} value={credentials.username} />
                </div>
                <div className="form-group">
                    <label htmlFor="password">Password:</label>
                    <input type="password" name="password" id="password" onChange={e => setCredentials({...credentials, password: e.target.value})} value={credentials.password} />
                </div>
                <input type="submit" value="LOGIN" />
            </div>
        </form>
    )
}

export default LoginForm;
