package br.com.alura.gerenciador;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Cookies {
	
	protected Cookie[] cookies;
	
	public Cookies(Cookie[] cookies){
		this.cookies = cookies;
	}
	
	public Cookie getUsuarioLogado(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if (cookies == null)
			return null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("usuario.logado")) {
				return cookie;
			}
		}
		return null;
	}

}
