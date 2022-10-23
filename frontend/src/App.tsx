import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from './pages/Listing';
import Form from './pages/Form';
import Login from './pages/Login';
import Header from "./components/Header";

function App() {
  return (
    <BrowserRouter>
      <Header />
      <Routes>

        <Route path="/" element={<Login />} />

        <Route path="/form">
          <Route path=":studentId" element={<Form />} />
        </Route>

        <Route path="/listing">
          <Route path=":senhaId" element={<Listing />} />
        </Route>

      </Routes>
    </BrowserRouter>
  );
}

export default App;
