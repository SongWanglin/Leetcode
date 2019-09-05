on :: (a->a->b)->(c->a)->c->c->b
on f g x y = g x `f` g y
