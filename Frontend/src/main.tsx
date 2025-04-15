import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import { HeroUIProvider } from '@heroui/react';
import App from './App';

ReactDOM.render(
  <React.StrictMode>
    <HeroUIProvider>
      <App />
    </HeroUIProvider>
  </React.StrictMode>,
  document.getElementById('root')
);
