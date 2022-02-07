import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import NavBar from "components/Navbar";
import Home from "pages/Home";
import Dashboard from "pages/Dashboard";
import Footer from "components/Footer";

function App() {
  return (
    <BrowserRouter>
        <NavBar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/dashboard" element={<Dashboard />} />
        </Routes>
        <Footer />
    </BrowserRouter>
  );
}

export default App;
