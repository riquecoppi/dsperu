import './styles.css';

function Acesso() {
    return (
        <>
            <div className="dsperu-login">
                <h2 className="dsperu-sales-title">ACESSO AO SISTEMA</h2>
                <form className="dsperu-form">
                    <div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Informe seu email</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="senha">Informe sua senha</label>
                            <input type="password" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-btn-container">
                            <button type="submit" className="btn btn-primary dsperu-btn">Entrar</button>
                        </div>


                    </div>
                </form>
            </div>


        </>
    )
}

export default Acesso;