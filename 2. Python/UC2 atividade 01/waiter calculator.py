events_duration_st = input("Digite a duração do evento em horas ")
events_duration = float(events_duration_st)

no_of_waiters_st = input("Digite o número de garçons que trabalhararão ")
no_of_waiters = int(no_of_waiters_st)

waiters_wage = 10.50
extra_wage_coord_waiter = 1.50

waiters_cost = waiters_wage * events_duration
print(waiters_cost)

coord_waiters_cost =  extra_wage_coord_waiter * events_duration
print(coord_waiters_cost)

events_total_cost = waiters_cost * no_of_waiters + coord_waiters_cost
print (f"O custo total do evento será de {events_total_cost} reais")