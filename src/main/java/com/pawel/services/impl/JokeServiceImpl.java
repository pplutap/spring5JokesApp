package com.pawel.services.impl;

import com.pawel.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 2017-10-20.
 */
@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes quotes;

	public JokeServiceImpl(ChuckNorrisQuotes quotes) {
		this.quotes = quotes;
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}
}
