select W2.id
from Weather as W1
join Weather as W2
on to_days(W1.recordDate)+1  = to_days(W2.recordDate)
where W2.temperature > W1.temperature