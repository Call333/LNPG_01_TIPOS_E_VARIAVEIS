import Control.Monad.RWS (MonadState(put))
converter :: Float -> Float
converter t = (t * 1.8) + 32

main :: IO()
main = do
    putStrLn "Digite a temperatura em Celsius: "
    input <- getLine
    let temperatura = read input :: Float
    putStrLn $ "A temperatura em C° é " ++ show (converter temperatura) ++ " em F°"