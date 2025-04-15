import React, { useEffect, useState } from 'react';
import LoginForm from './components/Login/Form';

function App() {
  useEffect(() => {
    window.Main.removeLoading();
  }, []);

  return (
    <div>
      <LoginForm />
    </div>
  );
}

export default App;
