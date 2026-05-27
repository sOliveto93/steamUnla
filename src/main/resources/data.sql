INSERT INTO GAME (NAME, GENRE, PRICE) VALUES
('The Witcher 3', 'RPG', 29.99),
('Cyberpunk 2077', 'RPG', 39.99),
('Red Dead Redemption 2', 'Action', 49.99),
('GTA V', 'Action', 19.99),
('Minecraft', 'Sandbox', 26.95),
('Terraria', 'Sandbox', 9.99),
('Stardew Valley', 'Simulation', 14.99),
('Hades', 'Roguelike', 24.99),
('Dead Cells', 'Roguelike', 19.99),
('Elden Ring', 'Soulslike', 59.99),
('Dark Souls III', 'Soulslike', 39.99),
('Sekiro', 'Action', 49.99),
('Bloodborne', 'Soulslike', 19.99),
('Hollow Knight', 'Metroidvania', 14.99),
('Ori and the Blind Forest', 'Platformer', 19.99),
('Ori and the Will of the Wisps', 'Platformer', 29.99),
('Celeste', 'Platformer', 19.99),
('Cuphead', 'Platformer', 19.99),
('Among Us', 'Party', 4.99),
('Fall Guys', 'Party', 19.99),
('Valorant', 'FPS', 0.00),
('CS:GO', 'FPS', 0.00),
('Counter Strike 2', 'FPS', 0.00),
('Call of Duty MW', 'FPS', 59.99),
('Battlefield 2042', 'FPS', 59.99),
('DOOM Eternal', 'FPS', 39.99),
('DOOM', 'FPS', 19.99),
('Fortnite', 'Battle Royale', 0.00),
('PUBG', 'Battle Royale', 29.99),
('Apex Legends', 'Battle Royale', 0.00),
('League of Legends', 'MOBA', 0.00),
('Dota 2', 'MOBA', 0.00),
('Smite', 'MOBA', 0.00),
('Heroes of the Storm', 'MOBA', 0.00),
('Diablo IV', 'ARPG', 69.99),
('Diablo III', 'ARPG', 19.99),
('Path of Exile', 'ARPG', 0.00),
('Borderlands 3', 'Shooter', 59.99),
('Borderlands 2', 'Shooter', 19.99),
('The Division 2', 'Shooter', 29.99),
('Warframe', 'Shooter', 0.00),
('Destiny 2', 'Shooter', 0.00),
('Skyrim', 'RPG', 19.99),
('Fallout 4', 'RPG', 19.99),
('Fallout New Vegas', 'RPG', 9.99),
('Dragon Age Inquisition', 'RPG', 19.99),
('Mass Effect Legendary', 'RPG', 59.99),
('Persona 5 Royal', 'JRPG', 59.99),
('Persona 4 Golden', 'JRPG', 19.99),
('Final Fantasy VII Remake', 'JRPG', 59.99),
('Final Fantasy XV', 'JRPG', 19.99),
('Zelda BOTW', 'Adventure', 59.99),
('Zelda TOTK', 'Adventure', 69.99),
('Horizon Zero Dawn', 'Adventure', 19.99),
('Horizon Forbidden West', 'Adventure', 59.99),
('Assassin Creed Valhalla', 'Adventure', 29.99),
('Assassin Creed Odyssey', 'Adventure', 19.99),
('Assassin Creed Origins', 'Adventure', 19.99),
('Far Cry 6', 'Shooter', 29.99),
('Far Cry 5', 'Shooter', 19.99),
('Far Cry 3', 'Shooter', 9.99),
('Watch Dogs 2', 'Adventure', 19.99),
('Watch Dogs Legion', 'Adventure', 29.99),
('Nier Automata', 'Action', 39.99),
('Nier Replicant', 'Action', 39.99),
('Ghost of Tsushima', 'Action', 59.99),
('Sekiro Shadows Die Twice', 'Action', 49.99),
('Metal Gear Solid V', 'Stealth', 19.99),
('Hitman 3', 'Stealth', 29.99),
('Hitman 2', 'Stealth', 19.99),
('Hitman 1', 'Stealth', 9.99),
('The Sims 4', 'Simulation', 39.99),
('Cities Skylines', 'Simulation', 29.99),
('Planet Zoo', 'Simulation', 44.99),
('Planet Coaster', 'Simulation', 44.99),
('Farming Simulator 22', 'Simulation', 39.99),
('Euro Truck Simulator 2', 'Simulation', 19.99),
('Assetto Corsa', 'Racing', 19.99),
('Forza Horizon 5', 'Racing', 59.99),
('Forza Motorsport', 'Racing', 59.99),
('Need for Speed Heat', 'Racing', 29.99),
('Need for Speed Unbound', 'Racing', 59.99),
('FIFA 23', 'Sports', 59.99),
('eFootball', 'Sports', 0.00),
('NBA 2K24', 'Sports', 69.99),
('WWE 2K23', 'Sports', 59.99),
('Tony Hawk Pro Skater', 'Sports', 39.99),
('Rocket League', 'Sports', 0.00),
('Dead by Daylight', 'Horror', 19.99),
('Resident Evil 4 Remake', 'Horror', 59.99),
('Resident Evil Village', 'Horror', 39.99),
('Outlast', 'Horror', 19.99),
('Phasmophobia', 'Horror', 13.99),
('Lethal Company', 'Horror', 9.99),
('The Forest', 'Survival', 19.99),
('Sons of the Forest', 'Survival', 29.99);


/*****************************/
INSERT INTO users (name) VALUES ('Sebastian');
INSERT INTO users (name) VALUES ('Maria');
INSERT INTO users (name) VALUES ('Juan');

/****************************/

INSERT INTO library (user_id, game_id) VALUES (1, 1);
INSERT INTO library (user_id, game_id) VALUES (1, 2);
INSERT INTO library (user_id, game_id) VALUES (1, 3);


INSERT INTO library (user_id, game_id) VALUES (2, 2);
INSERT INTO library (user_id, game_id) VALUES (2, 4);
INSERT INTO library (user_id, game_id) VALUES (2, 5);


INSERT INTO library (user_id, game_id) VALUES (3, 1);
INSERT INTO library (user_id, game_id) VALUES (3, 4);
INSERT INTO library (user_id, game_id) VALUES (3, 6);