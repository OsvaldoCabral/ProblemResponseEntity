import { useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  const simuleErrorFromBack = async () => {
    const { res } = await fetch('http://localhost:8080/hello', {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
      },
    });
    console.log(res);
    setMessage(res);
  };

  return (
    <>
      <h1>{message}</h1>
      <button onClick={simuleErrorFromBack}>Call from backend</button>
    </>
  );
}

export default App;
