import src.interfaces.AparelhoTelefonico;
import src.interfaces.Navegador;
import src.interfaces.ReprodutorMusical;

import java.util.List;

public class Iphone1 implements AparelhoTelefonico, Navegador, ReprodutorMusical {
	private boolean musicIsPlaying = false;
	private String musicThatIsPlaying;
	private List<String> tabs;
	@Override
	public void ligar() {
	}
	@Override
	public void atender() {

	}
	@Override
	public void iniciarCorreiodeVoz() {

	}

	@Override
	public void exibirPagina() {

	}

	@Override
	public void adicionarAba(String tab) {
		tabs.add(tab);
	}

	@Override
	public void fecharAba() {
		tabs.remove(tabs.size()-1);
	}

	@Override
	public void tocar() {
		musicIsPlaying = true;
	}

	@Override
	public void pausar() {
		musicIsPlaying = false;
	}

	@Override
	public void selecionarMusica(String musica) {
		musicThatIsPlaying = musica;
		musicIsPlaying = true;
	}

}
