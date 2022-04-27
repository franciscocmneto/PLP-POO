class Motor:
    def __init__(self, tipo, consumo):
        self.tipo = tipo
        self.consumo = consumo

    def get_tipo(self):
        return self.tipo

class Automovel:
    def __init__(self, cor, peso, motor):
        self.cor = cor
        self.peso = peso
        self.motor = motor

    def get_cor(self):
        return self.cor

    def get_peso(self):
        return self.peso

    def get_motor(self):
        return self.motor


class Carro(Automovel):

    def __init__(self,cor, peso, motor):
        numero_portas = 4
        placa = "AAA-1234"

        super().__init__(self,cor, peso, motor )

    def get_placa(self):
        return sel