import re

def check_haiku(poem):
    lines = re.split("/", poem)
    if len(lines) != 3:
        return "Не хайку. Должно быть 3 строки."
    syllables = [0, 0, 0]
    for i in range(3):
        syllables[i] = len(re.findall("[аоиеёэыуюя]", lines[i].lower()))
    if syllables == [5, 7, 5]:
        return "Хайку!"
    else:
        return f"Не хайку."

poem = "Вечер за окном. / Еще один день прожит. / Жизнь скоротечна..."
print(check_haiku(poem))

poem = "Жизнь скоротечна… / Думает ли об этом / Маленький мальчик."
print(check_haiku(poem))

poem = "Просто текст"
print(check_haiku(poem))

poem = "В небе такая луна, / Словно дерево спилено под корень… / Белеет свежий срез."
print(check_haiku(poem))

poem = "Мой палисадник… / Здесь впервые расцвел мой / Цветок пиона…"
print(check_haiku(poem))

poem = "Тихо, тихо ползи, / Улитка, по склону Фудзи, / Вверх, до самых высот!"
print(check_haiku(poem))


