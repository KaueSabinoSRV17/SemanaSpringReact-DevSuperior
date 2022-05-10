import { ReactComponent as GitHubIcon } from "assets/GitHub.svg";

import './styles.css'

function NavBar() {
  return (
    <header>
    <nav className="container">
        <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a href="https://github.com/KaueSabinoSRV17" target="_blank" rel="noreferrer">
                <div className="dsmovie-contact-container">
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
