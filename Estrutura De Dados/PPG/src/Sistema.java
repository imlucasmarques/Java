import static javax.swing.JOptionPane.*;


public class Sistema {

    Lista<Carga> cargas = new Lista<Carga>();
    double limitePeso = 10000.0; // kg
    double pesoAtual = 0.0; // kg

    public void iniciar() {
        String[] opcoesDisponiveis = { "Reservar carga", "Pesquisar carga", "Imprimir cargas reservadas",
                "Excluir cargas", "Finalizar" };
        boolean rodar = true;
        while (rodar) {
            System.out.println(cargas);
            int opcaoEscolhida = 0;
            do {
                opcaoEscolhida = inputSelecaoOpcoes("Sistema de reserva de cargas", opcoesDisponiveis);
            } while (opcaoEscolhida == 0);

            switch (opcaoEscolhida) {
                case 1:
                    reservarCarga();
                    break;
                case 3:
                    imprirCargasReservadas();
                    break;
                case 2:
                    pesquisarCarga();
                    break;
                case 4:
                    excluirCarga();
                    break;

                default:
                    rodar = false;
                    break;
            }
        }

    }

    private void excluirCarga() {
        String inputCnpj = showInputDialog("Digite o CNPJ da empresa respons�vel pela carga:");
        if (inputCnpj == null) {
            return;
        }

        boolean resultado = cargas.remover(new Carga(inputCnpj, null, null, 0));

        if (resultado) {
            showMessageDialog(getRootFrame(), "Carga foi deletada com sucesso!");
        } else {
            showMessageDialog(getRootFrame(), "Carga n�o foi encontrada!");

        }
    }

    private void pesquisarCarga() {
        String inputCnpj = showInputDialog("Digite o CNPJ da empresa respons�vel pela carga:");
        if (inputCnpj == null) {
            return;
        }

        No<Carga> resultadoBusca = cargas.pesquisar(new Carga(inputCnpj, null, null, 0));

        if (resultadoBusca == null) {
            showMessageDialog(getRootFrame(), "Carga n�o foi encontrada!");
        } else {
            showMessageDialog(getRootFrame(), resultadoBusca.getDado());
        }
    }

    private void imprirCargasReservadas() {
        
    	String aux = "";
    	
        if (cargas.getTamanho() > 0) {
           
        	No<Carga> imprimir = cargas.getInicio();
            
            do {
                aux += imprimir.getDado().toString();
                imprimir = imprimir.getLadoDireito();
                
            } while (imprimir != null);

        }
        
        showMessageDialog(getRootFrame(), aux);
    }

    private void reservarCarga() {
        String cnpjEmpresa = showInputDialog("Digite o CNPJ da empresa respons�vel pela carga:");
        if (cnpjEmpresa == null) {
            return;
        }

        String nomeEmpresa = showInputDialog("Digite o nome da empresa respons�vel pela carga:");
        if (nomeEmpresa == null) {
            return;
        }

        String destinoCarga = showInputDialog("Digite o destino da carga:");
        if (destinoCarga == null) {
            return;
        }

        double pesoCarga = 0.0;

        do {
            String pesoCargaString = showInputDialog("Digite o peso da carga:");
            if (pesoCargaString == null) {
                return;
            }

            try {
                pesoCarga = Double.parseDouble(pesoCargaString);
            } catch (NumberFormatException e) {
                showMessageDialog(getRootFrame(), "Digite um valor v�lido");
            }
        } while (pesoCarga == 0.0);

        if (pesoCarga + pesoAtual > limitePeso) {
            showMessageDialog(getRootFrame(), "O peso da carga excede o peso limite do navio! (10.000 kg)");
        } else {
            pesoAtual += pesoCarga;
            cargas.inserirInicio(new Carga(cnpjEmpresa, nomeEmpresa, destinoCarga, pesoCarga));
        }

    }

    // 0 -> Op��o inv�lida
    // -1 -> Cancelar
    private int inputSelecaoOpcoes(String titulo, String[] opcoesDisponiveis) {
        String msg = titulo + "\n";

        for (int i = 0; i < opcoesDisponiveis.length; i++) {
            msg += String.format("%d. %s\n", (i + 1), opcoesDisponiveis[i]);
        }

        String userInputString = showInputDialog(msg);

        if (userInputString == null) {
            return -1;
        }

        int resultado;

        try {
            resultado = Integer.parseInt(userInputString);
        } catch (NumberFormatException e) {
            return 0;
        }

        if (resultado < 1 || resultado > opcoesDisponiveis.length) {
            return 0;
        }

        return resultado;
    }

}