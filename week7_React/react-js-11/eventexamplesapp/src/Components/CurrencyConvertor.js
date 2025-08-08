import React, { useState } from 'react';
const CurrencyConvertor = () => {
    const [amount, setAmount] = useState('');
    const [euro,setEuro] = useState('');

    function convert() {
        if(!amount){
            alert("Please enter an amount");
            return;
        }
        setEuro(amount * 0.0098); 
    }
  return (
    <div>
        <h1 style={{color:'green', fontWeight:'bold'}}>Currency Convertor</h1>       
        <label htmlFor="amount">Amount:</label>
        <input type="text" id='amount' onChange={(e) => setAmount(e.target.value)}/>
        <label htmlFor="currency">Currency:</label>
        <input type="text" id='currency' />
<br />
        <button onClick={convert}>Convert</button>
        <h3>
            {amount} INR = {euro} EUR
        </h3>
    </div>
  )
}

export default CurrencyConvertor