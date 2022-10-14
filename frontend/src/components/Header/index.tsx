import logo from '../../assets/img/peru_logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>Perueiros de Bandeirantes-PR</h1>
                <p>
                    Desenvolvido por
                    <a href="https://github.com/riquecoppi/dsperu"> @sistemascoppi</a>
                </p>
            </div>
        </header>
    )
}

export default Header
