main :: IO ()
main = do
    putStrLn "Digite um número:"
    input <- getLine
    let number = read input :: Int
    if isPar number
        then putStrLn "O número é par."
        else putStrLn "O número é ímpar."

isPar :: Int -> Bool
isPar n = n `mod` 2 == 0