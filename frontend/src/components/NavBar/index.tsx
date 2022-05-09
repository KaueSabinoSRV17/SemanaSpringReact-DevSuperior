import { ReactComponent as GitHubIcon } from "assets/GitHub.svg";

import './styles.css'

function NavBar() {
  return (
    <header>
      <nav className="container">
            <div className="dsmovie-nav-content">
              <h1>DsMovie</h1>
              <a href="github.com/KaueSabinoSRV17">
                  <div className="dsmovie-nav-contact">
                    <GitHubIcon />
                    <p className="dsmovie-contact-link">/KaueSabinoSRV17</p>
                  </div>
              </a>
            </div>
      </nav>
    </header>
  );
}

export default NavBar;
