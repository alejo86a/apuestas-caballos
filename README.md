# apuestas-caballos ("Horse Betting")

A Java EE web application simulating horse race betting ("hipódromo"). Users can register as bettors, place bets on horses in a race, and see results (won/lost) update dynamically via AJAX.

## Features

- `HypodromServlet`, `HorsesServlet`, `BettorServlet` — handle race setup, horse listing, and bettor registration
- Model classes: `Horse`, `Bet`, `Bettor`, `Race`, `Hypodrom`
- JSP front end (`web/index.jsp`) with a jQuery/AJAX-driven dynamic table of bettors

## Tech stack

- Java (Servlets, Java EE)
- JSP for views
- jQuery / vanilla JS + AJAX on the front end
- IntelliJ IDEA project (`.iml`, `web.xml`), deployable to a servlet container like Tomcat

## Running it

Build/deploy as a standard Java EE web app (e.g. import into IntelliJ IDEA with a configured Tomcat server, or package as a WAR for any servlet container).

## Context

University coursework / practice project ("Primera Practica") implementing a simple OOP model (horses, bettors, bets, races) behind a servlet-based web UI.
