import './styles.css';

function Cadastro() {
    return (
        <>
            <div className="dsperu-login">
                <h2 className="dsperu-sales-title">CADASTRO DO ALUNO</h2>
                <form className="dsperu-form">
                    <div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Nome do Aluno</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Email</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Telefone do Aluno</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Escola</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>
                        <div className="dsperu-form-control-container">
                            <label htmlFor="email">Valor da Mensalidade</label>
                            <input type="text" className="dsperu-form-control" />
                        </div>

                        <div className="dsperu-form-btn-container">
                            <button type="submit" className="btn btn-primary dsperu-btn">Salvar</button>
                        </div>


                    </div>
                </form>
            </div>
        </>
    )
}
export default Cadastro