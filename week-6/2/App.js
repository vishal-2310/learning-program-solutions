import logo from './logo.svg';
import './App.css';
import {Home} from './Components/Home';
import {Contact} from './Components/Contact';
import {About} from './Components/About'; 


function App() {
  return(
    <div className='Container'>
      <Home />
      <Contact />
      <About />
    </div>
  );
}

export default App;
